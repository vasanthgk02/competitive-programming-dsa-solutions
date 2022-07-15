#include<bits/stdc++.h>
using namespace std;

int main(){

    //freopen("input.txt", "r", stdin);
    //freopen("output.txt", "w", stdout);

    ios::sync_with_stdio(0);
    cin.tie(0);
    ll a = 5;
    long long n;
    cin >> n;
    cout << n << " ";
    while(n != 1){
        if(n % 2 == 0){
            n /= 2;
        }else{
            n = n *3 + 1;
        }
        cout << n << " ";
    }


    return 0;
}