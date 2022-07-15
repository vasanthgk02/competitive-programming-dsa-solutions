#include <bits/stdc++.h>

using namespace std;

int main()
{

    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        int arr[n];
        long long sum = 0, m = INT_MIN;
        for (int i = 0; i < n; i++)
        {
            cin >> arr[i];
            sum += arr[i];
            if (m < arr[i])
            {
                m = arr[i];
            }
        }
        cout << fixed << setprecision(9) << 1.0 * (sum - m) / (n - 1) + m << endl;
    }
    return 0;
}