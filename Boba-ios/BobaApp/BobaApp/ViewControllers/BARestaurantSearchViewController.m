//
//  BARestaurantSearchViewController.m
//  BobaApp
//
//  Created by Brandon Tram on 10/4/14.
//  Copyright (c) 2014 coursera interns. All rights reserved.
//

#import "BARestaurantSearchViewController.h"
#import "Helpers.h"

NSString *const kRestaurantSearchTableViewCellId = @"restaurantSearchTableViewCell";

@class BARestaurantOrderViewController;

@implementation BARestaurantSearchViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    self.restaurantSearchTableView.delegate = self;
    self.restaurantSearchTableView.dataSource = self;
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
}

- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
    return 1;
}

- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {
    UITableViewCell *cell = [[UITableViewCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:kRestaurantSearchTableViewCellId];
    cell.textLabel.text = @"BITCH";
    return cell;
}

- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {
    UIStoryboard *storyboard = [Helpers getMainStoryboard];
    BARestaurantOrderViewController *restaurantOrderViewController = [storyboard instantiateViewControllerWithIdentifier:@"BARestaurantOrderViewController"];
    [self.navigationController pushViewController:(UIViewController *)restaurantOrderViewController animated:YES];
}

@end
