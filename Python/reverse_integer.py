#
# Written by Jay Ceballos
# 6/24/22
#

def reverse_integer(x):
    string = str(x);

    if string[0] == "-";
        return int("-"+string[:0:-1])
    else:
        return int(string[::-1])

print(solution(-123))
print(solution(678))
