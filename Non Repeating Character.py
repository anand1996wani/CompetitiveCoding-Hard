'''
Non Repeating Character

Given a string s consisting of lowercase Latin Letters, find the first non repeating character in s.
 '''

import collections as co
t = int(input().strip())
for anand in range(t):
    n = input()
    s = str(input().strip())
    d = co.OrderedDict()
    for i in s:
        if i not in d:
            d.update({i:1})
        else:
            d[i] = d[i] + 1
    for i in d:
        if d[i]==1:
            print(i)
            break
    else:
        print("-1")