#include <iostream>
using namespace std;

int calculate_water_needed(int S, int M, int L) {
    // Calculate water needed for small plants
    int small_plant_water = 2 * min(S, 10) + max(S - 10, 0);
    
    // Calculate water needed for medium plants
    int medium_plant_water = (5 + (M % 2)) * M;
    
    // Calculate water needed for large plants
    int large_plant_water = (10 + (L == 5 ? 2 : 0)) * L;
    
    // Return total water needed
    return small_plant_water + medium_plant_water + large_plant_water;
}

int main() {
    int S, M, L;
    // Input values for S, M, L
    cin >> S;
    cin >> M;
    cin >> L;
 
    int total_water_needed = calculate_water_needed(S, M, L);
    cout << total_water_needed << endl;
    
    return 0;
}
