# Write your code here :-)
import pygame
import time

pygame.init()

dis = pygame.display.set_mode((500,500))

X = 250
Y = 250

import random

def badanular():
    pygame.draw.rect(dis,'white',[X,Y,10,10])

x_makanan = random
y_makanan = random

X_SPEED = 0
Y_SPEED = 0

# forever loope

while True:
    for event in pygame.event.get():
        print(event)
        if event.type == pygame.QUIT:
            pygame.quit()
        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_RIGHT:
                X_SPEED = 10
                Y_SPEED = 0
            if event.key == pygame.K_LEFT:
                X_SPEED = -10
                Y_SPEED = 0
            if event.key ==  pygame.K_UP:
                Y_SPEED = -10
                X_SPEED = 0
            if event.key == pygame.K_DOWN:
                Y_SPEED = + 10
                X_SPEED = 0

    X = X + X_SPEED
    Y = Y + Y_SPEED
    time.sleep(0.5)

    dis.fill('black')

    badanular()
    
    pygame.draw.rect(dis,'blue',[x_makanan,y_makanan,10,10])

    pygame.display.update()

pygame.quit()
