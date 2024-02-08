import pygame
import time

pygame.init()

dis_width = 500
dis_height = 400
 
dis = pygame.display.set_mode((dis_width, dis_height))

pygame.display.set_caption('Snake Game')

running = True


# Snake Value Variable
x_pos = dis_width/2
y_pos = dis_height/2

x_speed = 10
y_speed = 0


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


    x_pos = x_pos + x_speed
    y_pos = y_pos + y_speed
    time.sleep(0.2)

    dis.fill('white')

    pygame.draw.rect(dis, 'blue', (x_pos, y_pos, 15,15))
    pygame.display.update()

pygame.quit()




print('abid ganteng')