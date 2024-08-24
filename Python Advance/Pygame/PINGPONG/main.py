import pygame, sys
from pygame.locals import QUIT


pygame.init()


window_width, window_height = 600, 400
window = pygame.display.set_mode((window_width, window_height))
pygame.display.set_caption("Ping Pong - 2 Player")
font = pygame.font.Font(None, 36)


SOFT_BLACK = (192, 192, 192)
SOFT_RED = (255, 182, 182)
SOFT_BLUE = (173, 216, 230)
WHITE = (255, 255, 255)
BLACK = (0,0,0)



# Paddle
paddle_width, paddle_height = 80, 15
paddle_x, paddle_y = (window_width - paddle_width) // 2, window_height - paddle_height - 10


# Ball
ball_radius = 5
ball_x, ball_y = window_width // 2, window_height // 2
ball_speed_x, ball_speed_y = 0, 3



#score 
score = 5


# Game loop
game_over = False

while not game_over:

    for event in pygame.event.get():
        if event.type == QUIT:
            pygame.quit()
            sys.exit()

    keys = pygame.key.get_pressed()
    if keys[pygame.K_LEFT] :
        paddle_x -= 5
    if keys[pygame.K_RIGHT] :
        paddle_x += 5




    #Ball Control 
    ball_x += ball_speed_x
    ball_y += ball_speed_y




    #Drawing
    window.fill(WHITE)  
    paddle = pygame.draw.rect(window, SOFT_BLUE, (paddle_x, paddle_y, paddle_width, paddle_height))  
    ball = pygame.draw.circle(window, BLACK, (ball_x, ball_y), ball_radius)

    score_text = font.render("Score: " + str(score), True, SOFT_BLACK)
    window.blit(score_text, (10, 10))
    pygame.display.update()
    pygame.time.delay(30)




    # Ball collisions with walls
    if ball.left <= 0 or ball.right >= window_width:
        ball_speed_x *= -1
    if ball.top <= 0:
        ball_speed_y *= -1


    # PADDEL TOUCH
    if pygame.Rect.colliderect(ball, paddle):
        ball_speed_y *= -1
        score += 1


    # GAME OVER
    if ball.bottom >= window_height:
        game_over = True


#GAME OVER SCREEN
window.fill(WHITE)
score_text = font.render("Score: " + str(score), True, BLACK)
window.blit(score_text, (10, 10))
game_over_text = font.render("Game Over", True, BLACK)
window.blit(game_over_text, ((window_width - game_over_text.get_width()) // 2, (window_height- game_over_text.get_height())//2))
pygame.display.update()
pygame.time.delay(2000)


# Close the Pygame window and quit
pygame.quit()
sys.exit()