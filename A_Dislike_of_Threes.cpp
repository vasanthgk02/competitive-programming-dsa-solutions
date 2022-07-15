#include <bits/stdc++.h>

using namespace std;

int main()
{

    int arr[1000];
    int value = 1;
    for (int i = 0; i < 1000; i++)
    {
        while (value % 3 == 0 || value % 10 == 3)
        {
            value++;
        }
        arr[i] = value++;
    }

    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        cout << arr[n - 1] << endl;
    }

    return 0;
}