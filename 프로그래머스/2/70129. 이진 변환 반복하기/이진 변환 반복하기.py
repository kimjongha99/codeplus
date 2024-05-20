def count_zeros(s):
    return s.count('0')

def to_binary(n):
    return bin(n)[2:]


def solution(s):
    remove_count = 0
    transform_count = 0
    while s != "1":
        transform_count += 1
        zeros_removed = count_zeros(s)
        remove_count += zeros_removed
        s = s.replace('0', '')
        length = len(s)
        s = to_binary(length)
    return [transform_count, remove_count]

    
    
    
    
    answer = []
    return answer