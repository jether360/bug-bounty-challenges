# just like the bug.html/.java  it accepts or stores temperature as strings

def main():
    print("Temperature Analyzer")
    print("Enter the temperature for each day:")

    temperature = []

   
    for i in range(1, 8):
        temp = input(f"Day {i}: ").strip()
        temperature.append(temp)

    sum_str = "0"  
    max_str = "-999" 

   
    for t in temperature:
        sum_str += t  
        if t > max_str:
            max_str = t  

    
   
    average = float(sum_str) / len(temperature)

    print(f"Weekly average: {average:.2f} °C")
    print(f"Hottest Day: {max_str} °C")

if __name__ == "__main__":
    main()
