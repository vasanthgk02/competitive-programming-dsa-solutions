#include <bits/stdc++.h>

using namespace std;

int main()
{

    int n;
    cin >> n;
    int arr[n][4];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i][0] >> arr[i][1] >> arr[i][2] >> arr[i][3];
    }
    for (int i = 0; i < n; i++)
    {
        int max1;
        if (arr[i][0] > arr[i][1])
        {
            max1 = 0;
        }
        else
        {
            max1 = 1;
        }
        int max2;
        if (arr[i][2] > arr[i][3])
        {
            max2 = 2;
        }
        else
        {
            max2 = 3;
        }
        if (arr[i][max1] < arr[i][max2 == 2 ? 3 : 2])
        {
            cout << "NO\n";
        }
        else if (arr[i][max2] < arr[i][max1 == 0 ? 1 : 0])
        {
            cout << "NO\n";
        }
        else
        {
            cout << "YES\n";
        }
    }
    return 0;
}