def solution(participant, completion):
    participant.sort();
    completion.sort();
    
    for index in range(len(completion)) :
        if completion[index] != participant[index]  :
            return participant[index];
        
    return participant[-1];
