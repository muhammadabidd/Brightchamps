import pygame
import sys




pygame.init()



# Set up the game window dimensions
window_width, window_height = 400, 300
window = pygame.display.set_mode((window_width, window_height))
pygame.display.set_caption('Simon Says')




WHITE = (255, 255, 255)


# Load images and sounds for superheroes
SUPERHEROES = {
  1: {
    'image': pygame.transform.scale(pygame.image.load('Python Advance\SimonSay\Brightchamps\superman.png'),
                                    (50, 100)),
    'sound': pygame.mixer.Sound('Python Advance\SimonSay\Brightchamps\superman.wav')
  },
  2: {
    'image': pygame.transform.scale(pygame.image.load('Python Advance\SimonSay\Brightchamps\ironman.png'),
                                    (50, 100)),
    'sound': pygame.mixer.Sound('Python Advance\SimonSay\Brightchamps\ironman.wav')
  },
  3: {
    'image': pygame.transform.scale(pygame.image.load('Python Advance\SimonSay\Brightchamps\\batman.png'),
                                    (50, 100)),
    'sound': pygame.mixer.Sound('Python Advance\SimonSay\Brightchamps\\batman.wav')
  },
  4: {
    'image':
    pygame.transform.scale(pygame.image.load('Python Advance\SimonSay\Brightchamps\spiderman.png'), (50, 100)),
    'sound':
    pygame.mixer.Sound('Python Advance\SimonSay\Brightchamps\spiderman.wav')
  },
}


# pygame.transform.scale(pygame.image.load('superman.png'), (50,50))







# Main game loop
gameover = False
while not gameover:
    for event in pygame.event.get():
      if event.type == pygame.QUIT:
        gameover = True



    window.fill(WHITE)  
    pygame.display.update()



# Quit the Pygame library and exit the program
pygame.quit()
sys.exit()
