#include <iostream>

using namespace std;

int main()
{
    string item1;
    string item2;
    string item3;
    
    cout<<"Please enter your 3 favourite foods"<<endl;
    cout<<"Item 1: ";
    cin>>item1;
    cout<<"Item 2: ";
    cin>>item2;
    cout<<"Item 3: ";
    cin>>item3;

    cout<<"Order confirmation! You have ordered:"<<endl;
    cout<<item1<<endl;
    cout<<item2<<endl;
    cout<<item3<<endl;

    return 0;
}