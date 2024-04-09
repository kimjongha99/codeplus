def solution(array, commands):
    answer = []

    # commands의len을 반복한다.
    for i in range(len(commands)):
        x = commands[i][0]
        y = commands[i][1]
        z = commands[i][2]
        extracted_part = array[x-1:y]
        extracted_part.sort()
        answer.append(extracted_part[z-1])

    return answer
    
    
