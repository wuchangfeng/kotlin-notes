# -*- coding: utf-8 -*- 
import os

root_dir = r"E:\DEV_Java\Kotlin\src"
read_me = r"E:\DEV_Java\Kotlin\readMe.md"

f = open(read_me, "w+")

def TreeList(root_dir):
    for lists in os.listdir(root_dir):
        path = os.path.join(root_dir, lists)
        file_path = path.split('\\',3)[-1].replace("\\","/")
        file_name = path.split('\\')[-1]
        md_url = "[%s](%s)\n" % (file_name, file_path)
        print (md_url)
        f.write(md_url + '\n' + '\n')
        if os.path.isdir(path):
            TreeList(path)
            f.write('\n')

if __name__ == '__main__':
    TreeList(root_dir)
    f.close

