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
    int count = n - 1;
    unordered_set<int> s;
    while (count--)
    {
        int temp;
        cin >> temp;
        s.insert(temp);
    }
    for (int i = 1; i <= n; i++)
    {
        if (s.find(i) == s.end())
        {
            cout << i << "\n";
        }
    }

    return 0;
}