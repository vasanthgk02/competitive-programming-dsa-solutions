#include <bits/stdc++.h>

#define F first
#define S second
#define PB push_back
#define MP make_pair
#define REP(i, a, b) for (int i = a; i <= b; i++)

using namespace std;

typedef long long ll;
typedef vector<int> vi;
typedef pair<int, int> pi;

int main()
{

    // freopen("input.txt", "r", stdin);
    // freopen("output.txt", "w", stdout);

    ios::sync_with_stdio(0);
    cin.tie(0);

    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        vi arr(n);
        REP(i, 0, n - 1)
        {
            cin >> arr[i];
        }
        long long ans = 0;
        for (int i = 1; i < n; i++)
        {
            ans = max(ans, arr[i] * (long long)arr[i - 1]);
        }
        cout << ans << "\n";
    }

    return 0;
}