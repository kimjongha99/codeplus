def solution(data, ext, val_ext, sort_by):

    answer= []
    
    for item in data:
        if ext =='date' and item[1]<val_ext:
            answer.append(item)
        elif ext == "code" and item[0] < val_ext:
            answer.append(item)
        elif ext == "maximum" and item[2] < val_ext:
            answer.append(item)
        elif ext == "remain" and item[3] < val_ext:
            answer.append(item)
            
            
        if sort_by == "date":
            sorted_answer = sorted(answer,key=lambda x:x[1])
        elif sort_by == "code":
            sorted_answer = sorted(answer, key=lambda x: x[0])
        elif sort_by == "maximum":
            sorted_answer = sorted(answer, key=lambda x: x[2])
        elif sort_by == "remain":
             sorted_answer = sorted(answer, key=lambda x: x[3])   
            
            
    return sorted_answer