import sys
import pygame

# 초기화
pygame.init()

# 창 생성
WIDTH, HEIGHT = 400, 300
SURFACE = pygame.display.set_mode((WIDTH, HEIGHT))
pygame.display.set_caption("파이게임 예제")

# 색상 정의
WHITE = (255, 255, 255)
RED = (255, 0, 0)
GREEN = (0, 255, 0)

# 게임 루프
def main():
    while True:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:  # pygame 모듈 사용
                pygame.quit()
                sys.exit()

        # 배경 색상 설정
        SURFACE.fill(WHITE)
        
        # 사각형 그리기
        pygame.draw.rect(SURFACE, RED, (100, 100, 200, 150))
        
        # 원 그리기
        pygame.draw.circle(SURFACE, GREEN, (300, 200), 50)
        
        # 화면 업데이트
        pygame.display.update()

if __name__ == '__main__':
    main()
