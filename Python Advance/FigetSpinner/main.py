import pygame
import sys
import math
from pygame.locals import QUIT,  MOUSEBUTTONDOWN


pygame.init()



# Set up the window
window_width, window_height = 600, 400
window = pygame.display.set_mode((window_width, window_height))
pygame.display.set_caption("Fidget Spinner")


# Colors
WHITE = (255, 255, 255)
BLACK = (0, 0, 0)


#Background
background_image = pygame.image.load("./Python Advance/FigetSpinner/background.jpg").convert()
background_image = pygame.transform.scale(background_image, (window_width, window_height))




#SPINNER IMG
spinner_images = [
    pygame.image.load("./Python Advance/FigetSpinner/fidget1.png").convert_alpha(),
    pygame.image.load("./Python Advance/FigetSpinner/fidget2.png").convert_alpha(),
    pygame.image.load("./Python Advance/FigetSpinner/fidget3.png").convert_alpha()
]






#SPINNER
spinner_width, spinner_height = 100, 100  # Desired spinner dimensions
spinner_images = [pygame.transform.scale(image, (spinner_width, spinner_height)) for image in spinner_images]
spinner_x, spinner_y = window_width // 2, window_height // 2
spinner_rotation = 0
spinner_rotation_speed = 0
current_spinner = 0


def change_spinner():
    global current_spinner
    current_spinner += 1
    if current_spinner >= len(spinner_images):
        current_spinner = 0


# Game loop
game_over = False

while not game_over:
        
    for event in pygame.event.get():
        if event.type == QUIT:
            pygame.quit()
            sys.exit()

        if event.type == MOUSEBUTTONDOWN:
            change_spinner()


    mouse_x, mouse_y = pygame.mouse.get_pos()
    print(mouse_x, mouse_y)

    angle = math.atan2(mouse_y - spinner_y, mouse_x - spinner_x)
    spinner_rotation_speed = math.degrees(angle)  # Convert radians to degrees

    # Rotate the spinner image
    spinner_rotation += spinner_rotation_speed
    rotated_spinner = pygame.transform.rotate(spinner_images[current_spinner], -spinner_rotation)
    spinner_rect = rotated_spinner.get_rect(center=(spinner_x, spinner_y))



    window.blit(background_image, (0, 0))
    window.blit(rotated_spinner, spinner_rect)
    # window.fill(WHITE)


    pygame.display.update()
    pygame.time.delay(30)


# Close the Pygame window and quit
pygame.quit()
sys.exit()