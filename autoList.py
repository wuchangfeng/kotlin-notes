# -*- coding: utf-8 -*- 
import os
root_dir = r"C:\Users\hyc\IdeaProjects\Kotlin\src"
read_me = r"C:\Users\hyc\IdeaProjects\Kotlin\readMe.md"
f = open(read_me, "w+")

def TreeList(root_dir):

    for lists in os.listdir(root_dir):
        path = os.path.join(root_dir, lists)
        file_name = path.split('\\')[-1]
        print(file_name)
        f.write(file_name + '\n' + '\n')
        if os.path.isdir(path):
            TreeList(path)
            f.write('\n')

if __name__ == '__main__':
    TreeList(root_dir)
    f.close