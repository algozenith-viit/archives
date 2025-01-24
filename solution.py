
n = int(input()) 
c = int(input())  

m = list(map(int, input().split()))  
b = list(map(int, input().split()))  
p = list(map(int, input().split()))  
payment = [0] * n
for i in range(c):
    
    remaining = m[i] - b[i]
    
    
    base_payment = remaining // n
    remainder = remaining % n
    
    
    for j in range(n):
        payment[j] += base_payment
    
    
    friends_with_priority = sorted([(p[j], j) for j in range(n)], reverse=True)
    
   
    for j in range(remainder):
        priority_friend = friends_with_priority[j][1]
        payment[priority_friend] += 1


print(" ".join(map(str, payment)))


