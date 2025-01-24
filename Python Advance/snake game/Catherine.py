import pygame
import random

# Initialize Pygame
pygame.init()


GRID_SIZE = 16
screen_width = 20 * GRID_SIZE * 2
screen_height = 12 * GRID_SIZE * 2

screen = pygame.display.set_mode((screen_width, screen_height))
pygame.display.set_caption("Snake Game")


# Colors
white = (255, 255, 255)
black = (0, 0, 0)
green = (0, 255, 0)
red = (255, 0, 0)
grey = (169, 169, 169)

clock = pygame.time.Clock()



game_over = False



class Snake:

   

    def __init__(self):

        self.head = (screen_width/2, screen_height/2)
        self.x_speed = GRID_SIZE
        self.y_speed = 0
        self.body = []
        self.max_length = 10

    def move(self):

        self.head = (self.head[0] + self.x_speed,  self.head[1] + self.y_speed)



    def drawsnakebody(self):
        for box in self.body:
            pygame.draw.rect(screen, black, (box[0], box[1], GRID_SIZE, GRID_SIZE))


    def change_direction(self, x_speed, y_speed):
            self.y_speed = y_speed
            self.x_speed = x_speed

    def teleportfromwall(self):
        old_x, old_y = self.head
        if self.head[0]+ GRID_SIZE > screen_width:
            self.head = (0, old_y)

        elif self.head[0] < 0 : 
            self.head = (screen_width - GRID_SIZE, old_y)

        elif self.head[1] + GRID_SIZE > screen_height :
            self.head = (old_x, 0)
        elif self.head[1]  < 0 :
            self.head = (old_x,screen_height - GRID_SIZE)


    def takenotes(self):
        self.body.append(self.head)
        print(self.body)

        if len(self.body) > self.max_length:
            self.body.pop(0)
            

        



mysnake = Snake()



def drawGrid():
    for i in range(1, 24):
        pygame.draw.line(screen, grey, (0, GRID_SIZE * i), (screen_width, GRID_SIZE * i), 1)

    for i in range(1, 40):
        pygame.draw.line(screen, grey, (GRID_SIZE * i, 0), (GRID_SIZE * i, screen_height), 1)



while not game_over:

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            game_over = True

        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_LEFT:
                mysnake.change_direction(-GRID_SIZE, 0)
            elif event.key == pygame.K_RIGHT:
                mysnake.change_direction(GRID_SIZE, 0)
            elif event.key == pygame.K_DOWN:
                mysnake.change_direction(0, GRID_SIZE)
            elif event.key == pygame.K_UP:
                mysnake.change_direction(0, -GRID_SIZE)


    screen.fill(white)

    drawGrid()
    mysnake.move()
    mysnake.teleportfromwall()
    mysnake.takenotes()
    mysnake.drawsnakebody()




    pygame.display.update()
    clock.tick(5)


pygame.quit()
quit()
