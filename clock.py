def interpret(str_time):
    
    hour, mins = str_time.split(':')
    return [int(hour), int(mins)]
    

def clock(hour, mins):

    m_angle = 6*mins
    h_angle = 30*hour + 0.5*mins
    res = abs(h_angle - m_angle)
    return res if res<180 else 180-res
    
if __name__ == "__main__":
    hour, mins = interpret('5:30')
    print(clock(hour, mins))    