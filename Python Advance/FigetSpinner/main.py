import pygame
import sys

from pygame.locals import QUIT


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


#SPINNER
spinner_width, spinner_height = 300, 300  # Desired spinner dimensions
# spinner_images = [pygame.transform.scale(image, (spinner_width, spinner_height)) for image in spinner_images]
spinner_x, spinner_y = window_width // 2, window_height // 2
spinner_rotation = 0
spinner_rotation_speed = 0
# current_spinner = 0





# Game loop
game_over = False

while not game_over:
        
    for event in pygame.event.get():
        if event.type == QUIT:
            pygame.quit()
            sys.exit()


    mouse_x, mouse_y = pygame.mouse.get_pos()
    print(mouse_x, mouse_y)



    window.blit(background_image, (0, 0))
    # window.fill(WHITE)


    pygame.display.update()
    pygame.time.delay(30)


# Close the Pygame window and quit
pygame.quit()
sys.exit()