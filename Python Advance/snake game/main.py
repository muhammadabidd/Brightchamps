import pygame
import random

# Initialize Pygame
pygame.init()

# Set screen dimensions and colors
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
snake_speed = 15



# Snake block size
block_size = 20



game_over = False
game_close = False



# Object Oriented Programming (OOP)
class Snake:
     
    def __init__(self):
        self.x = screen_width/2
        self.y = screen_height/2
        self.x_speed = GRID_SIZE
        self.y_speed = 0
        self.body = [(self.x, self.y)]



    def move (self):
        self.x = self.x + self.x_speed
        self.y = self.y + self.y_speed


        newhead = (self.x, self.y)

        self.body.insert(0, newhead)


    def draw(self):
         
         pygame.draw.rect(screen, black, (self.x, self.y, GRID_SIZE, GRID_SIZE))

    
    def change_direction(self, x_speed, y_speed):
        self.x_speed = x_speed
        self.y_speed = y_speed


    def teleportfromwall(self):
        if self.x + GRID_SIZE > screen_width :
            self.x = 0
        elif self.x < 0 :
            self.x = screen_width - GRID_SIZE
        elif self.y + GRID_SIZE > screen_height :
            self.y = 0
        elif self.y  < 0 :
            self.y = screen_height - GRID_SIZE
         


 
         
         

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
            elif event.key == pygame.K_UP:
               mysnake.change_direction(0, -GRID_SIZE)
            elif event.key == pygame.K_DOWN:
              mysnake.change_direction(0,GRID_SIZE)

  

       
    



    
    screen.fill(white)
    drawGrid()
    
    mysnake.draw()
    mysnake.move()
    mysnake.teleportfromwall()


   

    pygame.display.update()

    clock.tick(5)


pygame.quit()
quit()
