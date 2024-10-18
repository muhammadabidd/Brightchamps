import pygame
import sys
import random
import time



pygame.init()



# Set up the game window dimensions
window_width, window_height = 400, 300
window = pygame.display.set_mode((window_width, window_height))
pygame.display.set_caption('Simon Says')




WHITE = (255, 255, 255)


# Load images and sounds for superheroes
SUPERHEROES = {
  1: {
    'image': pygame.transform.scale(pygame.image.load('Python Advance/SimonSay/Brightchamps/superman.png'),
                                    (50, 100)),
    'sound': pygame.mixer.Sound('Python Advance/SimonSay/Brightchamps/superman.wav')
  },
  2: {
    'image': pygame.transform.scale(pygame.image.load('Python Advance/SimonSay/Brightchamps/ironman.png'),
                                    (50, 100)),
    'sound': pygame.mixer.Sound('Python Advance/SimonSay/Brightchamps/ironman.wav')
  },
  3: {
    'image': pygame.transform.scale(pygame.image.load('Python Advance/SimonSay/Brightchamps/batman.png'),
                                    (50, 100)),
    'sound': pygame.mixer.Sound('Python Advance/SimonSay/Brightchamps/batman.wav')
  },
  4: {
    'image':
    pygame.transform.scale(pygame.image.load('Python Advance/SimonSay/Brightchamps/spiderman.png'), (50, 100)),
    'sound':
    pygame.mixer.Sound('Python Advance/SimonSay/Brightchamps/spiderman.wav')
  },
}


# pygame.transform.scale(pygame.image.load('superman.png'), (50,50))

def display_message(message):
  font = pygame.font.SysFont(None, 30)
  text = font.render(message, True, (0, 0, 0))
  text_rect = text.get_rect(center=(window_width // 2, window_height // 4))
  window.fill((255, 255, 255))
  window.blit(text, text_rect)
  pygame.display.update()

def display_superhero_images():
  for i in range(1, 5):
    window.blit(SUPERHEROES[i]['image'], ((i - 1) * 100 + 25, 150))
  pygame.display.update()


sequence = []
def play_sequence(length):
  global sequence
  sequence = [random.randint(1, 4) for _ in range(length)
              ]  # Generate a sequence of random superheroes

  # Display the message to listen and remember the sequence
  display_message("Listen the sequence!")

  # Play the sounds in the sequence
  for superhero_num in sequence:
    SUPERHEROES[superhero_num]['sound'].play()
    pygame.time.delay(1000)

  display_message("Your turn to repeat the sequence!")
  display_superhero_images()





def play_sound_and_get_response():
  global sequence

  # Increase the sequence length by one
  sequence_length = len(sequence) + 1

  # Play the sequence
  play_sequence(sequence_length)

  # Wait for the player's response
  for superhero_num in sequence:
    waiting_for_input = True
    while waiting_for_input:
      for event in pygame.event.get():
        if event.type == pygame.MOUSEBUTTONDOWN:
          mouse_x, mouse_y = pygame.mouse.get_pos()
          image_rect = SUPERHEROES[superhero_num]['image'].get_rect(
            topleft=((superhero_num - 1) * 100 + 25, 150))
          if image_rect.collidepoint(mouse_x, mouse_y):
            waiting_for_input = False
          else:
            return False  # Wrong sequence, game over

  return True  # Correct sequence, continue the game





# Main game loop
gameover = False
while not gameover:
    for event in pygame.event.get():
      if event.type == pygame.QUIT:
        gameover = True


    correct_sequence = play_sound_and_get_response()
    print("ONE SESSION IS COMPLETE")
    time.sleep(10)





    # display_message("WELCOME!")
    # pygame.time.delay(1000)
    # display_superhero_images()
    # window.fill(WHITE)  
    pygame.display.update()





# Quit the Pygame library and exit the program
pygame.quit()
sys.exit()
