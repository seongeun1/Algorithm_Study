def main(factors):
    factor_min = min(factors)
    factor_max = max(factors)
    print(factor_min * factor_max)
  

if __name__ == "__main__":
    num_factors = input()
    factors     = input().split()
    factors     = list(map(int, factors))
    main(factors)
