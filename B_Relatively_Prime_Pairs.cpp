#include <bits/stdc++.h>

using namespace std;

int main()
{

    unsigned long long n1, n2;
    cin >> n1 >> n2;
    if ((n2 - n1 + 1) % 2 == 0)
    {
        cout << "YES\n";
        while (n1 < n2)
        {
            cout << n1 << " " << n1 + 1 << "\n";
            n1 += 2;
        }
    }
    else
    {
        cout << "NO";
    }

    return 0;
}