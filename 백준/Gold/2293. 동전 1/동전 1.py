n, k = map(int, input().split())  # n과 k를 입력 받음
coins = [int(input()) for _ in range(n)]  # 각 동전의 가치를 입력 받아 리스트에 저장
# dp 테이블 초기화 (0원을 만드는 경우는 1가지로 초기화)
dp = [0] * (k + 1)
dp[0] = 1

# 각 동전에 대하여
for coin in coins:
    # coin부터 k까지 (해당 동전을 사용하여 만들 수 있는 가치)
    for value in range(coin, k + 1):
        # 현재 가치(value)를 만드는 경우의 수에,
        # 현재 동전(coin)을 제외하고 (value-coin)을 만드는 경우의 수를 더한다.
        dp[value] += dp[value - coin]

# k원을 만드는 경우의 수 출력
print(dp[k])
