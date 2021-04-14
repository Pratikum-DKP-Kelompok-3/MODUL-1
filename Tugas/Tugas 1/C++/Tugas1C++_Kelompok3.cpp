#include <iostream>
#include <cmath>

using namespace std;

//Declare Fungsi
double Luas(double pi, double r);
  
int main() {
    double pi, r;
    pi = 3.14f;
    r = 14.0;
    cout <<"Kelompok: kelompok 3" << endl;
    cout << "Shift: shift 1" << endl;
    cout << "Nama anggota 1: Ananda Muhammad Zahir (21120120140115)" << endl;
    cout << "Nama anggota 2: Didan Hasan Murtaqi (21120120140103)" << endl;
    cout << "Nama anggota 3: Juliant Raffa (21120120130127)" << endl;
    cout << "Nama anggota 4: Sachiko Fitria Ramandanti (21120120140103)" << endl << endl;
    cout << "Luas Lingkaran Adalah " << Luas(pi,r) << endl;
    cin.get();
    return 0;
}

//Fungsi
double Luas(double pi, double r){
    
    return 0.75 * pi * pow(r,2);
}

