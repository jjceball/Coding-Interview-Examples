#
# Written by Jay Ceballos
# 6/24/22
#

def first_unique_character(str):
    save = {}

    for i in str:
        if i not in save:
            save[i] = 1
        else:
            save[i] +=1

    for i in range(len(str)):
        if save[str[i]] == 1:
            return i

    return -1
