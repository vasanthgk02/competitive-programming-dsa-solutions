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
        int ans = 0;
        if (n <= 9)
        {
            cout << n << endl;
            continue;
        }
        int digits = log10(n) + 1, divisor = 0;
        while (digits--)
        {
            divisor = divisor * 10 + 1;
        }
        if (divisor <= n)
        {
            ans = n / divisor;
        }
        divisor /= 10;
        ans += (log10(divisor) + 1) * 9;
        cout << ans << endl;
    }
    return 0;
}