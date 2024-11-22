import pygame
import random
import sys

# Initialize the Pygame library
pygame.init()
clock = pygame.time.Clock()

# Set up the window dimensions
screen_width, screen_height = 700, 700
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







class Asteroid:
    def __init__(self, x, y, image, scale):
        self.x = x
        self.y = y
        self.image = image
        self.scale = scale


        self.image = pygame.transform.scale(image, (int(image.get_width() * scale), (int(image.get_height() * scale))))

    def move(self, speed):
        self.y += speed

    def draw(self, window):
        window.blit(self.image, (self.x, self.y))


asteroid_img = pygame.image.load("./Python Advance/collider/asteroid.png").convert_alpha()
asteroid_width, asteroid_height = asteroid_img.get_size()


def update_background():
    global background1_y, background2_y
    background1_y = (background1_y + 1) % screen_height
    background2_y = background1_y - screen_height
    window.blit(background1, (0, background1_y))
    window.blit(background2, (0, background2_y))

# Variables to keep track of background position for scrolling effect
background1_y = 0
background2_y = -screen_height



asteroid_x =  random.randint(30, screen_width - 30)
asteroid_scale = random.uniform(0.2, 0.3)
asteroid = Asteroid(asteroid_x,  -int(asteroid_height * asteroid_scale), asteroid_img, asteroid_scale)






game_running = True
while game_running:

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            game_running = False


    keys = pygame.key.get_pressed()

    if keys[pygame.K_LEFT]:
        spaceship_x -= spaceship_speed
        print("THE LEFT KEY IS PRESSED")
        print(spaceship_x)
        if spaceship_x < 0:
            spaceship_x = 0
    if keys[pygame.K_RIGHT]:
        spaceship_x += spaceship_speed
        print("THE RIGHT KEY IS PRESSED")
        print(spaceship_x)
        if spaceship_x > screen_width - spaceship_img.get_width():
            spaceship_x = screen_width - spaceship_img.get_width()

    window.fill((0, 0, 0))

    window.blit(spaceship_img, (spaceship_x, spaceship_y))
    spaceship_rect = pygame.Rect(spaceship_x, spaceship_y, spaceship_img.get_width(), spaceship_img.get_height())

    update_background()


   


    asteroid.draw(window)
    asteroid.move(0.8)


    pygame.display.update()
    clock.tick(60)


pygame.quit()
sys.exit()
