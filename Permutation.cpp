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

void permutation(string str, string res = "")
{
    if (res.length() == str.length())
    {
        cout << res << "\n";
    }
    else
    {
        REP(i, 0, str.length() - 1)
        {
            if (find(res.begin(), res.end(), str[i]) != res.end())
            {
                continue;
            }
            res.push_back(str[i]);
            permutation(str, res);
            res.pop_back();
        }
    }
}

int main()
{

    // freopen("input.txt", "r", stdin);
    // freopen("output.txt", "w", stdout);

    ios::sync_with_stdio(0);
    cin.tie(0);

    string str;
    cin >> str;
    cout << "The permutations are :\n";
    permutation(str);

    return 0;
}