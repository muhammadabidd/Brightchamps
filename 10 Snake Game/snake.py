import pygame
import time
import random

pygame.init()

# Background Setup
dis_width = 500
dis_height = 400

# Game Setup 
dis = pygame.display.set_mode((dis_width, dis_height))
clock = pygame.time.Clock()
pygame.display.set_caption('Snake Game')
fps = 10
running = True



# Snake Value Variable
x_pos = dis_width/2
y_pos = dis_height/2

x_speed = 10
y_speed = 0

snake_list = []
snake_len = 3

width = 500
height = 400
foodx = random.randrange(0,width - 10)//10 * 10
foody = random.randrange(0,height - 10)//10 * 10
print(foodx, foody)

score = 0


# Defining snake function
def the_snake(snake_list):
    for snake_body in snake_list:
        pygame.draw.rect(dis, 'blue', [snake_body[0], snake_body[1], 10, 10])


# Score text
font_style = pygame.font.SysFont("bahnschrift", 25)
score_font = pygame.font.SysFont("comicsansms", 35)
def message(msg, color):
    mesg = font_style.render(msg, True, color)
    dis.blit(mesg, (20,20))


while running:


    for event in pygame.event.get():
        print(event)
        if event.type == pygame.QUIT:
            running = False

        # Move Control
        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_RIGHT:
                x_speed = 10
                y_speed = 0
                # x_pos = x_pos +  10
            if event.key == pygame.K_LEFT:
                # x_pos = x_pos -  10
                x_speed = -10
                y_speed = 0
            if event.key == pygame.K_UP:
                # y_pos = y_pos -  10
                x_speed = 0
                y_speed = -10
            if event.key == pygame.K_DOWN:
                # y_pos = y_pos +  10
                x_speed = 0
                y_speed = 10

    # make the snake run every frame
    x_pos = x_pos + x_speed
    y_pos = y_pos + y_speed
    # time.sleep(0.2)

    # If touches the edge
    if x_pos >= width or x_pos <= 0 or y_pos >= height or y_pos <= 0:
        running = False



    # Draw background
    dis.fill('white')
    message('Score : {}'.format(score), 'blue')

    # Creating food
    pygame.draw.rect(dis, 'green', (foodx, foody, 10,10))


    # Defining the position of snake head each time
    snake_head = []
    snake_head.append(x_pos)
    snake_head.append(y_pos)
    snake_list.append(snake_head)


    # Running the snake function
    the_snake(snake_list)


    # set so that it doesnt touch its body
    for i in snake_list[:-1]:
        if snake_head == i:
            running = False

    # Delete the last tail
    if len(snake_list) > snake_len:
        del snake_list[0]


    #Updating the food after eaten
    if x_pos == foodx and y_pos == foody:
        foodx = random.randrange(0,width - 10)//10 * 10
        foody = random.randrange(0,height - 10)//10 * 10

        snake_len = snake_len + 1
        print(foodx, foody)
        score = score + 1




    pygame.display.update()
    clock.tick(fps)

pygame.quit()




print('abid ganteng')