import pygame
import random
import sys

# Initialize the Pygame library
pygame.init()

# Set up the window dimensions
screen_width, screen_height = 400, 300
window = pygame.display.set_mode((screen_width, screen_height))
pygame.display.set_caption("Space Collider Game")


# Load and resize the background images to fit the window
background1 = pygame.image.load("./Python Advance/collider/space_background.jpg").convert()
background1 = pygame.transform.scale(background1, (screen_width, screen_height))
background2 = pygame.transform.scale(background1, (screen_width, screen_height))

# Load and resize the spaceship image

spaceship_img = pygame.image.load("./Python Advance/collider/spaceship.png").convert_alpha()
spaceship_width, spaceship_height = spaceship_img.get_size()
spaceship_scale = 0.15
spaceship_img = pygame.transform.scale(spaceship_img, (int(spaceship_width * spaceship_scale), int(spaceship_height * spaceship_scale)))

# Spaceship initial position at the top
spaceship_x = screen_width // 2 - spaceship_width // 2
spaceship_y = screen_height - 50
spaceship_speed = 3



game_running = True
while game_running:

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            game_running = False


    window.fill((0, 0, 0))

    pygame.display.update()


pygame.quit()
sys.exit()
