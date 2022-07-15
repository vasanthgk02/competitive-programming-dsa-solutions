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

    // freopen("IO_Folder/input.txt", "r", stdin);
    // freopen("IO_Folder/output.txt", "w", stdout);

    ios::sync_with_stdio(0);
    cin.tie(0);

    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        if (n % 2 == 1)
        {
            cout << -1 << "\n";
        }
        else
        {
            cout << 0 << " " << 0 << " " << n / 2 << "\n";
        }
    }

    return 0;
}