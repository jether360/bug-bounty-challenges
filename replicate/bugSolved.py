

#improvised version saa bug.py replaced day with temperature para di confusing

def main():
    print("Temperature Analyzer")
    print("Enter the temperature for each day:")

    temperature = []

 
    for i in range(1, 8):
        temp = input(f"Day {i}: ").strip()
        temperature.append(int(temp))

    sum_temp = 0
    max_temp = -999


    for t in temperature:

        sum_temp += t 
        if t > max_temp:
            max_temp = t  

    average = sum_temp / len(temperature)

    print(f"Weekly average: {average:.2f} °C")
    print(f"Hottest Temperature: {max_temp} °C")

if __name__ == "__main__":
    main()
