#code
'''
Given a string str containing only lowercase characters.
The problem is to print the characters along with their frequency in order of their occurrence 
and in the given format explained in the examples below.


'''
t = int(input())
for anand in range(t):
    s = str(input())
    d = {}
    q = []
    for i in s:
        if i not in d:
            d.update({i:1})
            q.append(i)
        else:
            d[i] = d[i] + 1
    for i in q:
        print(str(i) + ":" + str(d[i]))
    print()
