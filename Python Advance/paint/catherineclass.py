import pygame
from pygame.locals import QUIT

# Initialize Pygame
pygame.init()

# Constants for WINDOW dimensions
WINDOW_WIDTH = 1000
WINDOW_HEIGHT = 1000
TOOLBAR_HEIGHT = 50

# Colors
WHITE = (255, 255, 255)
BLACK = (0, 0, 0)
GRAY = (200, 200, 200)
RED = (255, 0, 0)
YELLOW = (255, 255, 0)
BLUE = (0, 0, 255)



WINDOW = pygame.display.set_mode((WINDOW_WIDTH, WINDOW_HEIGHT))
pygame.display.set_caption("PAINT")




# Create a surface for drawing (same as the WINDOW size)
canvas = pygame.Surface((WINDOW_WIDTH, WINDOW_HEIGHT - TOOLBAR_HEIGHT))
canvas.fill(WHITE)

# Create a surface for the toolbar
toolbar = pygame.Surface((WINDOW_WIDTH, TOOLBAR_HEIGHT))
toolbar.fill(GRAY)

font = pygame.font.Font(None, 24)
pen_text = font.render("P", True, BLACK)
eraser_text = font.render("E", True, BLACK)
decrease_text = font.render("-", True, BLACK)
increase_text = font.render("+", True, BLACK)
clear_text = font.render("C", True, BLACK)



# Main game loop
running = True
while running:



    # Draw the toolbar
    toolbar.fill(GRAY)
    toolbar.blit(pen_text, (40, 20))
    toolbar.blit(eraser_text, (80, 20))
    toolbar.blit(decrease_text, (120, 20))
    toolbar.blit(increase_text, (160, 20))
    toolbar.blit(clear_text, (200, 20))











    # Handle the Events
    for event in pygame.event.get():
        if event.type == QUIT:
            running = False

    WINDOW.fill(WHITE)

    # Draw the canvas and toolbar on the WINDOW
    WINDOW.blit(canvas, (0, TOOLBAR_HEIGHT))
    WINDOW.blit(toolbar, (0, 0))

     # Update the display
    pygame.display.flip()


# Quit Pygame
pygame.quit()