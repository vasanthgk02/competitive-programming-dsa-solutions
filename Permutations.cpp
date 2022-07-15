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

    int n;
    cin >> n;
    if (n <= 3)
    {
        cout << "NO SOLUTION";
        return 0;
    }
    for (int i = 2; i <= n; i += 2)
    {
        cout << i + 2 << " " << i << " ";
    }
    if (n % 2 != 0)
    {
        cout << 1;
    }

    return 0;
}