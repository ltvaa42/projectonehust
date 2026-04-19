#include <iostream>
#include <map>
using namespace std;
int main() {
    map<int, string> students;  // std::map là cây đỏ-đen

    students[1] = "An";
    students[3] = "Bình";
    students[2] = "Cường";

    for (auto s : students)
        cout << s.first << " - " << s.second << endl;

    return 0;
}





