        elif event.type == pygame.MOUSEBUTTONDOWN:
            if event.pos[1] <= TOOLBAR_HEIGHT:
                pass
            else:
                drawing = True
                last_pos = (event.pos[0], event.pos[1] - TOOLBAR_HEIGHT)  # Adjust last_pos

        elif event.type == pygame.MOUSEBUTTONUP:
            drawing = False
            last_pos = None  # Reset last_pos when not drawing
        elif event.type == pygame.MOUSEMOTION and drawing:
            # Draw with the selected brush color or eraser color (white)
            color = brush_color if not eraser_mode else WHITE
            pygame.draw.line(canvas, color, last_pos, (event.pos[0], event.pos[1] - TOOLBAR_HEIGHT), brush_size)
            last_pos = (event.pos[0], event.pos[1] - TOOLBAR_HEIGHT)