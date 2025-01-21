def calculate_water_needed(S, M, L):
    # Calculate water needed for small plants
    small_plant_water = 2 * min(S, 10) + max(S - 10, 0)
    
    # Calculate water needed for medium plants
    medium_plant_water = (5 + (M % 2)) * M
    
    # Calculate water needed for large plants
    large_plant_water = (10 + (2 if L == 5 else 0)) * L
    
    # Return total water needed
    return small_plant_water + medium_plant_water + large_plant_water
    
total_water_needed = calculate_water_needed(S, M, L)
print(total_water_needed)