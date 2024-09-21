#include <bits/stdc++.h>
using namespace std;
#define int long long int
#define one ios_base::sync_with_stdio(false)
#define two cin.tie(NULL)
void solve(){
    int n;cin >> n;string s;cin >> s;
    int cnt[2] = {0};string str;
    str.push_back(s[0]);
    for (int i = 1; i < n; i++) {
        if (s[i]==s[i-1] && s[i]=='0') continue;
        str.push_back(s[i]);
    }
    for (int jj = 0; jj < str.size(); jj++) cnt[str[jj] - '0']++;
    cout << ((cnt[1] > cnt[0]) ? "yes" : "no") << endl;
}
signed main() {
    one;two;
    int tt;cin >> tt;
    while (tt--) {
        solve();
    }
    return 0;
}