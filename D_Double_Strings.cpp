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
        vector<string> arr(n);
        unordered_set<string> s;
        for (int i = 0; i < n; i++)
        {
            cin >> arr[i];
        }
        for (int i = 0; i < n; i++)
        {
            int j = i;
            do
            {
                s.insert(arr[i] + arr[j]);
                j = (j + 1) % n;
            } while (j != i);
        }
        string ans;
        for (int i = 0; i < n; i++)
        {
            if (s.count(arr[i]))
                ans += "1";
            else
                ans += "0";
        }
        cout << ans << "\n";
    }

    return 0;
}