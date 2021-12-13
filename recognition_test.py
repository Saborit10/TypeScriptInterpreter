
import os

TEST_FOLDER = './tests'

def read_file(file_name):
    f = open(file_name)

    ans = f.readlines()
    f.close()
    
    for i in range(len(ans)):
        ans[i] = ans[i].strip()

    return ans

def test_case(number):
    in_file = os.path.join(TEST_FOLDER, 'in' + str(number) + '.txt')
    out_file = os.path.join(TEST_FOLDER, 'ans' + str(number) + '.txt')
    
    os.system('java Main < ' + in_file + ' 2> out')
    
    if not os.system('diff out ' + out_file):
        print('Test ' + str(number) + ": OK")
    else:
        print('Test ' + str(number) + ": FAILED!!!")

    os.system('rm out')


if __name__ == '__main__':
    num = 1

    while True:
        filename = os.path.join(TEST_FOLDER, 'in' + str(num) + '.txt')
        
        if not os.path.exists(filename):
            break

        test_case(num)

        num += 1