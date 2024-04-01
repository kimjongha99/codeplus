def fac(n):    # 팩토라얼 수행
    if n ==0 or n ==1:
        return 1
    else:
        return n*fac(n-1)

def comb(a,b):
    return  int(fac(b) / (fac(a)*fac(b-a)))  #조합의 공식을 적어주고 int형으로 형변환한다. 

def solve():
    a, b = [int(x) for x in input().split()] #1. 입력 받고

    print(comb(a,b))  #2. 조합 함수 생성 



t = int(input())

for _ in range(t):
    solve()
