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

    int m, n, a;
    cin >> m >> n >> a;
    cout << ceil(m / a) * ceil(n / a);

    return 0;
}