
def solution(board, h, w):
    # n에 board의 길이를 저장
    n = len(board)
    # 같은 색으로 색칠된 칸의 개수를 저장할 변수 count 초기화
    count = 0
    # h와 w의 변화량을 저장할 리스트 dh, dw 초기화
    dh = [0, 1, -1, 0]
    dw = [1, 0, 0, -1]
    # 반복문을 이용해 주변 칸을 확인
    for i in range(4):
        h_check = h + dh[i]
        w_check = w + dw[i]
        # h_check와 w_check가 board 범위 내에 있고, 선택한 칸과 같은 색인지 확인
        if 0 <= h_check < n and 0 <= w_check < n and board[h][w] == board[h_check][w_check]:
            count += 1
    return count