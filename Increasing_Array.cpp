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

    long long n;
    cin >> n;
    long long arr[n];
    for (long long i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    long long ans = 0, mx = arr[0];
    for (long long i = 1; i < n; i++)
    {
        if (arr[i] >= mx)
        {
            mx = max(mx, arr[i]);
            continue;
        }
        ans += abs(arr[i] - mx);
    }
    cout << ans;

    return 0;
}