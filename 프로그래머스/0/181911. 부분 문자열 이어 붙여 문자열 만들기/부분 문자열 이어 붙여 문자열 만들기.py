def solution(my_strings, parts):
    result = ''
    for i, (s, e) in enumerate(parts):
        result += my_strings[i][s:e+1]  # e+1은 슬라이스 끝 인덱스가 포함되지 않기 때문에 +1
    return result
